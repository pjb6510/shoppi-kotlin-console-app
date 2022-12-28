fun main(args: Array<String>) {
    println("안녕하세요. Shoppi에 오신 것을 환영합니다.")
    println("쇼핑을 계속 하시려면 이름을 입력해주세요. :)")

    val name = readLine()

    println(
        """
        감사합니다. 반갑습니다. $name 님
        원하시는 카테고리를 입력해주세요.
        ***=====================***
        """.trimIndent()
    )

    val categories = arrayOf("패션", "전자기기", "반려동물용품")
    categories.forEach { item -> println(item) }
    println("장바구니로 이동하시려면 #을 입력해주세요.")

    var seletedCategory = readLine()
    while (seletedCategory.isNullOrBlank()) {
        println("값을 입력해주세요.")
        seletedCategory = readLine()

        when (seletedCategory) {
            "패션" -> println("패션 카테고리로 이동") // TODO: 카테고리 이동 구현
            "전자기기" -> println("전자기기 카테고리로 이동")
            "반려동물용품" -> println("반려동물용품 카테고리로 이동")
        }
    }
}