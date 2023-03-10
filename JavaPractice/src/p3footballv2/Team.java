/**
 * 
 */
package p3footballv2;

/**
 * class that shows the team 
 * @author Millar McIlwain
 *
 */
public class Team {

	String teamName; 
	int gamesPlayed, goalsFor, goalsAgainst, win, draw, loss, totalPoints;
	/**
	 * @param teamName
	 * @param gamesPlayed
	 * @param goalsFor
	 * @param goalsAgainst
	 * @param win
	 * @param draw
	 * @param loss
	 * @param totalPoints
	 */
	public Team(String teamName, int gamesPlayed, int goalsFor, int goalsAgainst
			) {

		this.teamName = teamName;
		this.gamesPlayed = gamesPlayed;
		this.goalsFor = goalsFor;
		this.goalsAgainst = goalsAgainst;

	
	}

	/**
	 * @param teamName
	 * @param gamesPlayed
	 * @param goalsFor
	 * @param goalsAgainst
	 * @param win
	 * @param draw
	 * @param loss
	 * @param totalPoints
	 */
	public Team(String teamName, int gamesPlayed, int goalsFor, int goalsAgainst, int win, int draw, int loss
			) {

		this.teamName = teamName;
		this.gamesPlayed = gamesPlayed;
		this.goalsFor = goalsFor;
		this.goalsAgainst = goalsAgainst;
		this.win = win;
		this.draw = draw;
		this.loss = loss;
	
	}
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}
	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	/**
	 * @return the gamesPlayed
	 */
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	/**
	 * @param gamesPlayed the gamesPlayed to set
	 */
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed += gamesPlayed;
	}
	/**
	 * @return the goalsFor
	 */
	public int getGoalsFor() {
		return goalsFor;
	}
	/**
	 * @param goalsFor the goalsFor to set
	 */
	public void setGoalsFor(int goalsFor) {
		this.goalsFor += goalsFor;
	}
	/**
	 * @return the goalsAgainst
	 */
	public int getGoalsAgainst() {
		return goalsAgainst;
	}
	/**
	 * @param goalsAgainst the goalsAgainst to set
	 */
	public void setGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst += goalsAgainst;
	}
	/**
	 * @return the win
	 */
	public int getWin() {
		return win;
	}
	/**
	 * @param win the win to set
	 */
	public void setWin(int win) {
		this.win += win;
	}
	/**
	 * @return the draw
	 */
	public int getDraw() {
		return draw;
	}
	/**
	 * @param draw the draw to set
	 */
	public void setDraw(int draw) {
		this.draw += draw;
	}
	/**
	 * @return the loss
	 */
	public int getLoss() {
		return loss;
	}
	/**
	 * @param loss the loss to set
	 */
	public void setLoss(int loss) {
		this.loss += loss;
	}
	/**
	 * @return the totalPoints
	 */
	public int getTotalPoints() {
		return totalPoints;
	}
	/**
	 * @param totalPoints the totalPoints to set
	 */
	public void setTotalPoints(int totalPoints) {
		this.totalPoints += totalPoints;
	}
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", gamesPlayed=" + gamesPlayed + ", goalsFor=" + goalsFor
				+ ", goalsAgainst=" + goalsAgainst + ", win=" + win + ", draw=" + draw + ", loss=" + loss
				+ ", totalPoints=" + totalPoints + "]";
	}

	
	
}
