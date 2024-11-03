package lotto.eunm;

public enum WinningResult {
    THREE(3, 5_000),
    FOUR(4, 50_000),
    FIVE(5, 1_500_000),
    FIVE_AND_BONUS(5, 30_000_000),
    SIX(6, 2_000_000_000);

    public final int winningCount;
    public final int prizeMoney;

    WinningResult(int matchCount, int prizeMoney) {
        this.winningCount = matchCount;
        this.prizeMoney = prizeMoney;
    }

}
