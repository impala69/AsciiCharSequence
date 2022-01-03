public class checkLabels {
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++)
            if (analyzers[i].processText(text) != Label.OK)
                return analyzers[i].processText(text);
        return Label.OK;
    }
}
enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}
interface TextAnalyzer {
    Label processText(String text);
}

class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }
    private String[] keywords;

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    public Label processText(String text) {
        return Label.SPAM;
    }
}
class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private final String[] keywordsK = {":(", "=(", ":|"};


    @Override
    protected String[] getKeywords() {
        return keywordsK;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

}
class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;

    public TooLongTextAnalyzer(int limit) {
        this.maxLength = limit;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength)
            return Label.TOO_LONG;
        else
            return Label.OK;
    }
}
abstract class KeywordAnalyzer implements TextAnalyzer{
    protected abstract String [] getKeywords();
     protected abstract  Label  getLabel();

    @Override
    public Label processText(String text) {
        String[] keywords=getKeywords();
        for (String keyword:keywords){
            if (text.contains(keyword)){
                return getLabel();
            }
        }return Label.OK;
    }
}
