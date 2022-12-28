package screen

class ShoppingCategory {
    fun showCategories() {
        val categories = arrayOf("패션", "전자기기", "반려동물용품")
        categories.forEach { item -> println(item) }
        println("장바구니로 이동하시려면 #을 입력해주세요.\n")

        var seletedCategory = readLine()
        while (seletedCategory.isNullOrBlank()) {
            println("값을 입력해주세요.\n")
            seletedCategory = readLine()
        }

        when (seletedCategory) {
            "패션" -> println("패션 카테고리로 이동") // TODO: 카테고리 이동 구현
            "전자기기" -> println("전자기기 카테고리로 이동")
            "반려동물용품" -> println("반려동물용품 카테고리로 이동")
            else -> {
                showErrorMessage(seletedCategory)
            }
        }
    }

    private fun showErrorMessage(seletedCategory: String?) {
        println("[$seletedCategory] : 존재하지 않는 카테고리입니다. 다시 입력해주세요.\n")
        showCategories()
    }
}