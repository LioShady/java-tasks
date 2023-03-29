package ru.mail.polis.homework.analyzer;

public class TooLongAnalyzer implements TextAnalyzer {
    private final long maxLength;
    private final FilterType type = FilterType.TOO_LONG;

    TooLongAnalyzer(long maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean isCorrect(String text) {
        return text.length() <= maxLength;
    }

    @Override
    public FilterType getType() {
        return type;
    }
}
