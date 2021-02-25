
public class MerchandizeItem {
	private String itemCode;
	private int quantity;
	private Double unitPrice;
	
	public MerchandizeItem() {}

	public MerchandizeItem(String itemCode, int quantity, Double unitPrice) {
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "MerchandizeItem [itemCode=" + itemCode + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}
	
	
}
