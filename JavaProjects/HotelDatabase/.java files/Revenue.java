
public class Revenue {
	
	private String roomType;
	private int revenue;
	
	public Revenue(String roomType, int revenue){
		this.roomType = roomType;
		this.revenue = revenue;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return "Revenue [roomType=" + roomType + ", revenue=" + revenue + "]";
	}
	
	

}
