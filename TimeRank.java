
public class TimeRank {
	private String name;
	private long time;
	public TimeRank(String name,long time) {
		this.name = name;
		this.time = time;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public long getTime() {
		return time;
	}
}
