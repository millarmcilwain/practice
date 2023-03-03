/**
 * 
 */
package p3scoreprocessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Millar McIlwain
 *
 */
public class FootballTeam {

	String teamName;
	int gamesPlayed, goalsFor, goalsAgainst, wins, draws, losses, points;
	
	
	public FootballTeam() {
		
	}
	
	/**
	 * @param teamName
	 * @param gamesPlayed
	 * @param goalsFor
	 * @param goalsAgainst
	 * @param wins
	 * @param draws
	 * @param losses
	 * @param points
	 */
	public FootballTeam(String teamName, int gamesPlayed, int goalsFor, int goalsAgainst, int wins, int draws,
			int losses, int points) {
		super();
		this.teamName = teamName;
		this.gamesPlayed = gamesPlayed;
		this.goalsFor = goalsFor;
		this.goalsAgainst = goalsAgainst;
		this.wins = wins;
		this.draws = draws;
		this.losses = losses;
		this.points = points;
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
		this.gamesPlayed = gamesPlayed;
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
		this.goalsFor = goalsFor;
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
		this.goalsAgainst = goalsAgainst;
	}
	/**
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}
	/**
	 * @param wins the wins to set
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}
	/**
	 * @return the draws
	 */
	public int getDraws() {
		return draws;
	}
	/**
	 * @param draws the draws to set
	 */
	public void setDraws(int draws) {
		this.draws = draws;
	}
	/**
	 * @return the losses
	 */
	public int getLosses() {
		return losses;
	}
	/**
	 * @param losses the losses to set
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}
	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}
	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "FootballTeam [teamName=" + teamName + ", gamesPlayed=" + gamesPlayed + ", goalsFor=" + goalsFor
				+ ", goalsAgainst=" + goalsAgainst + ", wins=" + wins + ", draws=" + draws + ", losses=" + losses
				+ ", points=" + points + "]";
	}
	
	
	
}
