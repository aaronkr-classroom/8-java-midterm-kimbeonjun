public class LibrarySystem {
	// 변수 정의
	private Book[] booklist;
	private static int bookCount = 0;
	private static final int NUM_BOOK = 10;
	// 생성자 정의
	public LibrarySystem() {
	    this.booklist = new Book[NUM_BOOK]; // 생성자
	}

	public void addBook(Book book) {
		// 책 추가
		// 도움을 위해 Cart.java의 insertBook(Book book)을 참조하세요
	}
	
	public void removeBook(String title) {
    	// `for` LibrarySystem의 모든 Book
		for ( int i = 0; i < bookCount; i++ ) {

      		// `if` 책 제목이 발견되면
			if ( booklist[i].getTitle().equals(title)) {
				
                // 찾은 책부터 시작하여 모든 요소를 왼쪽으로 이동합니다.
				for ( int j = i; j < bookCount - 1; j++ ) {
					booklist[j] = booklist[j+1];
				}
        
				// 마지막 요소를 null로 설정하고 bookCount를 줄입니다.
				booklist[--bookCount] = null;
				System.out.println("라이브러리에서 '" + title + "' 삭제했습니다.");
        
				return; // 책 제거 후 종료 방법
			}
		}
		// 찾을 수 없으면 메시지를 인쇄합니다.
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}
	
	public void borrowBook(String title) {
        // `for` LibrarySystem의 모든 Book {
		for ( int i = 0; i < bookCount; i++ ) {
            // `if` 책 제목이 발견되면 {
			if ( booklist[i].getTitle().equals(title)) {
                // `if` 책이 있다면 {
				if ( booklist[i].isAvailable()) {
                    // setAvailable을 false로 설정하고 메시지를 출력합니다.
				// } `else` 책이 없다면 {
					// 메시지를 인쇄하다
				// }
				return; // 책 제거 후 종료 방법
			// }
		// }
		// 찾을 수 없으면 메시지를 인쇄합니다.
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}
	
	public void returnBook(String title) {
	    // `for` LibrarySystem의 모든 Book {
		for ( int i = 0; i < bookCount; i++) {
            // `if` 책 제목이 발견되면 {
			if ( booklist [i].getTitle().equals(title)) {
                // `if` 책이 없다면 {
				if ( !booklist[i].isAvailable()) {
                    // setAvailable을 true로 설정하고 메시지를 출력합니다.
					setAvailable = true;
				// } `else` 책이 있다면 {
					// 메시지를 인쇄하다
				// }
				return; // 책 제거 후 종료 방법
			// }
		// }
		// 찾을 수 없으면 메시지를 인쇄합니다.
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}
	
	public void displayAllBooks() {
		// 책 목록 출력 (책이름, 저자, 출판년도, 대출가능여부 출력)
		System.out.println("쉽게 배우는 JSP 웹 프로그래밍", "송미영", "2018/10/08", "Available");
		System.out.println("안드로이드 프로그래밍", "우재남", "2022/01/22", "Available");
		System.out.println("스크래치", "고광일", "2019/06/10", "Available");

        /* 
        Expected output:
        "ISBN1234 | JSP 웹 프로그래밍 | 송미영 | 2018 | Available"
        "ISBN1235 | 안드로이드 프로그래밍 | 우재남 | 2022 | Out"
        ...
        */
    
        // 도움을 위해 Cart.java의 printBookList()를 참조하세요
    }

}
