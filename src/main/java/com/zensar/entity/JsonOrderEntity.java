package com.zensar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JSONORDERCONSUMER")
public class JsonOrderEntity {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "messageName")
	public String messageName;
	
	@Column(name = "command")
    public String command;
	
	@Column(name = "itemName")
    public String itemName;
	
	@Column(name = "itemDescription")
    public String itemDescription;
	
	@Column(name = "itemLength")
    public double itemLength;
	
	@Column(name = "itemWidth")
    public double itemWidth;
	
	@Column(name = "itemHeight")
    public double itemHeight;
	
	@Column(name = "itemWeight")
    public double itemWeight;
	
	@Column(name = "imagePathname")
	public String imagePathname;
	
	@Column(name = "rfidTagged")
    public String rfidTagged;
	
	@Column(name = "storageAttribute")
    public int storageAttribute;
	
	@Column(name = "pickType")
    public String pickType;
	
	@Column(name = "upcList")
    public String upcList;

	
	public JsonOrderEntity() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMessageName() {
		return messageName;
	}


	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}


	public String getCommand() {
		return command;
	}


	public void setCommand(String command) {
		this.command = command;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public double getItemLength() {
		return itemLength;
	}


	public void setItemLength(double itemLength) {
		this.itemLength = itemLength;
	}


	public double getItemWidth() {
		return itemWidth;
	}


	public void setItemWidth(double itemWidth) {
		this.itemWidth = itemWidth;
	}


	public double getItemHeight() {
		return itemHeight;
	}


	public void setItemHeight(double itemHeight) {
		this.itemHeight = itemHeight;
	}


	public double getItemWeight() {
		return itemWeight;
	}


	public void setItemWeight(double itemWeight) {
		this.itemWeight = itemWeight;
	}


	public String getImagePathname() {
		return imagePathname;
	}


	public void setImagePathname(String imagePathname) {
		this.imagePathname = imagePathname;
	}


	public String getRfidTagged() {
		return rfidTagged;
	}


	public void setRfidTagged(String rfidTagged) {
		this.rfidTagged = rfidTagged;
	}


	public int getStorageAttribute() {
		return storageAttribute;
	}


	public void setStorageAttribute(int storageAttribute) {
		this.storageAttribute = storageAttribute;
	}


	public String getPickType() {
		return pickType;
	}


	public void setPickType(String pickType) {
		this.pickType = pickType;
	}


	public String getUpcList() {
		return upcList;
	}


	public void setUpcList(String upcList) {
		this.upcList = upcList;
	}


	public JsonOrderEntity(int id, String messageName, String command, String itemName, String itemDescription,
			double itemLength, double itemWidth, double itemHeight, double itemWeight, String imagePathname,
			String rfidTagged, int storageAttribute, String pickType, String upcList) {
		super();
		this.id = id;
		this.messageName = messageName;
		this.command = command;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemLength = itemLength;
		this.itemWidth = itemWidth;
		this.itemHeight = itemHeight;
		this.itemWeight = itemWeight;
		this.imagePathname = imagePathname;
		this.rfidTagged = rfidTagged;
		this.storageAttribute = storageAttribute;
		this.pickType = pickType;
		this.upcList = upcList;
	}


	@Override
	public String toString() {
		return "JsonOrderEntity [id=" + id + ", messageName=" + messageName + ", command=" + command + ", itemName="
				+ itemName + ", itemDescription=" + itemDescription + ", itemLength=" + itemLength + ", itemWidth="
				+ itemWidth + ", itemHeight=" + itemHeight + ", itemWeight=" + itemWeight + ", imagePathname="
				+ imagePathname + ", rfidTagged=" + rfidTagged + ", storageAttribute=" + storageAttribute
				+ ", pickType=" + pickType + ", upcList=" + upcList + "]";
	}
    
	
    
}
