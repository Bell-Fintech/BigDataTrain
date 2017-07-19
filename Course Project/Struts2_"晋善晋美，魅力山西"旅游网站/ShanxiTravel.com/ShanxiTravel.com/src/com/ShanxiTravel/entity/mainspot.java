package com.ShanxiTravel.entity; 
import com.ShanxiTravel.entity.images;

public class mainspot implements java.io.Serializable {

	
	private static final long serialVersionUID = 5438652179728768054L;
	

	private String id;
    private String name;
	private int price;
	private String city;
	private String type;
	private String editorial;
	private Long image;
	private String route;
	private images imageInfo;
	private String comment;

	// Constructors
	
	public String getId() {
		return id;
	}

	public images getImageInfo() {
		return imageInfo;
	}

	public void setImageInfo(images imageInfo) {
		this.imageInfo = imageInfo;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Long getImage() {
		return image;
	}

	public void setImage(Long image2) {
		this.image = image2;
	}
	
	public void setInfoImage(Long image) {
		this.image = image;
	}
	

	

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/** default constructor */
	public mainspot() {
	}

	public mainspot(String id, String name, int price, String city, String type, String editorial, Long image,
			String comment) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.city = city;
		this.type = type;
		this.editorial = editorial;
		this.image = image;
		this.comment = comment;
	}


}