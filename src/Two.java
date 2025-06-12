public class Two implements Player {
    final boolean[] opponentHistory;
    int recordIndex = 0;

    public Two(int maxRounds) {
        this.opponentHistory = new boolean[10];
    }


    @Override
    public boolean cooperate(int round) {
        if(round == 1) {
            return  true;
        }

        return opponentHistory[round - 2];
    }

    @Override
    public void recordOpponentMove(boolean opponentMove) {
        opponentHistory[recordIndex++] = opponentMove;
    }
}