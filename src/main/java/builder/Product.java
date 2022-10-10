package builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {

    private String id;
    private String name;
    private String description;
    private BigDecimal amount;
    private boolean inStock;
    private LocalDateTime createDate;

    public Product() {}

    public Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.amount = builder.amount;
        this.inStock = builder.inStock;
        this.createDate = builder.createDate;
    }

    public String getId() {
        return id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", inStock=" + inStock +
                ", createDate=" + createDate +
                '}';
    }

    public static class Builder {
        private String id;
        private String name;
        private String description;
        private BigDecimal amount;
        private boolean inStock;
        private LocalDateTime createDate;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder inStock(boolean inStock) {
            this.inStock = inStock;
            return this;
        }

        public Builder createDate(LocalDateTime createDate) {
            this.createDate = createDate;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
