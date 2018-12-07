package sharkTank;

import java.util.ArrayList;

public interface DbInterface {
	public ArrayList FilterBySeries(int series);
	public ArrayList FilterBySeason(int season);
	public ArrayList FilterByAmount(float amount);
	public ArrayList FilterByGender(String gender);
	public ArrayList FilterByRow(int row);

}
