package screen

import extensions.getNotEmptyString

/**
step1. 장바구니에 추가한 상품 관리
step2. 사용자 입력값 요청 처리 공통화
step3. 프로젝트 전역에서 참조하는 상수
 */
class ShoppingCategory : Screen() {
    fun showCategories() {
        ScreenStack.push(this)
        val categories = arrayOf("패션", "전자기기", "반려동물용품")
        categories.forEach { item -> println(item) }
        println("장바구니로 이동하시려면 #을 입력해주세요.\n")

        val seletedCategory = readLine().getNotEmptyString()

        if (seletedCategory == "#") {
            val shoppingCart = ShoppingCart()
            shoppingCart.showCartItems()
        } else if (categories.contains(seletedCategory)) {
            val shoppingProductList = ShoppingProductList()
            shoppingProductList.showProducts(seletedCategory)
        } else {
            showErrorMessage(seletedCategory)
        }
    }

    private fun showErrorMessage(seletedCategory: String?) {
        println("[$seletedCategory] : 존재하지 않는 카테고리입니다. 다시 입력해주세요.\n")
        showCategories()
    }
}