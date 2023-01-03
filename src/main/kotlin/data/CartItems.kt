package data

object CartItems {
    private val mutableProducts = mutableMapOf<Product, Int>()
    val products: Map<Product, Int> = mutableProducts

    fun addProduct(toBeAddedProduct: Product) {
        mutableProducts[toBeAddedProduct]?.let { existedProductCount ->
            mutableProducts[toBeAddedProduct] = existedProductCount + 1
        } ?: kotlin.run {
            mutableProducts[toBeAddedProduct] = 1
        }
    }
}