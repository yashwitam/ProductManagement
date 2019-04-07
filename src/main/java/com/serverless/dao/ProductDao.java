package com.serverless.dao;

public class ProductDao {
/*
    private static DynamoDBAdapter db_adapter;
    Product product = new Product();
    private Logger logger = Logger.getLogger(this.getClass());


    public void save(Product product) throws IOException {
        logger.info("Products - save(): " + product.toString());
        product.getMapper().save(product);
    }

    public Product get(String id) throws IOException {
        Product product = null;

        HashMap<String, AttributeValue> av = new HashMap<String, AttributeValue>();
        av.put(":v1", new AttributeValue().withS(id));

        DynamoDBQueryExpression<Product> queryExp = new DynamoDBQueryExpression<Product>()
                .withKeyConditionExpression("id = :v1")
                .withExpressionAttributeValues(av);

        PaginatedQueryList<Product> result = product.getMapper().query(Product.class, queryExp);
        if (result.size() > 0) {
            product = result.get(0);
            logger.info("Products - get(): product - " + product.toString());
        } else {
            logger.info("Products - get(): product - Not Found.");
        }
        return product;
    }

    public Boolean delete(String id) throws IOException {
        Product product = null;

        // get product if exists
        product = get(id);
        if (product != null) {
            logger.info("Products - delete(): " + product.toString());
            product.getMapper().delete(product);
        } else {
            logger.info("Products - delete(): product - does not exist.");
            return false;
        }
        return true;
    }

    public List<Product> list() throws IOException {
        DynamoDBScanExpression scanExp = new DynamoDBScanExpression();
        List<Product> results = product.getMapper().scan(Product.class, scanExp);
        for (Product p : results) {
            logger.info("Products - list(): " + p.toString());
        }
        return results;
    }
*/
}
