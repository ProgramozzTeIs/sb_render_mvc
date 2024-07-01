package pti.sb_render_mvc.dto;

public class UserDto {
	
	private int id;
	private String name;
	private int hp;
	
	
	public UserDto(int id, String name, int hp) {
		super();
		this.id = id;
		this.name = name;
		this.hp = hp;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	

}
