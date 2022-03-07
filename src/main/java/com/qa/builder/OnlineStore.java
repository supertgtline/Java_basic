package com.qa.builder;

public class OnlineStore {
    private Long id;
    private String name;
    private String address;
    private Long budget;
    private Long discountRate;
    public static class Builder{
        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Long getBudget() {
            return budget;
        }

        public void setBudget(Long budget) {
            this.budget = budget;
        }

        public Long getDiscountRate() {
            return discountRate;
        }

        public void setDiscountRate(Long discountRate) {
            this.discountRate = discountRate;
        }

        private String name;
        private String address;
        private Long budget;
        private Long discountRate;
    }
}
