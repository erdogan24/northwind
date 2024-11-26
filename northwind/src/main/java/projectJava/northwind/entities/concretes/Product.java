package projectJava.northwind.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

// @Data (lombok)
// @AllArgsConstructor(Constructırların hepsinin gitmesini sağlayan lombok)
// NoArgsConstructor(parametresiz constructor'ın lombok ile  gitmesini sağlar)

@Entity
@Table(name="products")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})

public class Product {
		  
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="product_id")
		private int id;
		
	//	@Column(name="category_id")
	//	private int categoryId;
		
		@Column(name="product_name")
		private String productName;
		
		@Column(name="unit_price")
		private double unitPrice;
		
		@Column(name="unit_in_stock")
		private short unitsInStock;
		
		@Column(name="quantity_per_unit")
		private String quantityPerUnit;
		
		@ManyToOne()
		@JoinColumn(name ="category_id")
		private Category category;
		
		public Product() {
			
		}
		
		public Product(int id, String productName, double unitPrice, short unitsInStock,
				String quantityPerUnit) {
			super();
			this.id = id;
		  //this.categoryId = categoryId;
			this.productName = productName;
			this.unitPrice = unitPrice;
			this.unitsInStock = unitsInStock;
			this.quantityPerUnit = quantityPerUnit;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	/*	public int getCategoryId() {
			return categoryId;
		}
		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}
												*/
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public double getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		public short getUnitsInStock() {
			return unitsInStock;
		}
		public void setUnitsInStock(short unitsInStock) {
			this.unitsInStock = unitsInStock;
		}
		public String getQuantityPerUnit() {
			return quantityPerUnit;
		}
		public void setQuantityPerUnit(String quantityPerUnit) {
			this.quantityPerUnit = quantityPerUnit;
		}
		
}




