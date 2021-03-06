package com.kay.designpatterns.builder.template;

class ProductBuilderB implements Builder {

    private Product product = new Product();

    @Override
    public void setPart1() {
        product.setPart1("B产品part1");
    }

    @Override
    public void setPart2() {
        product.setPart2("B产品part2");
    }

    @Override
    public Product build() {
        return this.product;
    }

}
