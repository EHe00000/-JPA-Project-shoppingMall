
document.addEventListener('DOMContentLoaded', function() {
    // 책 정보를 추가할 요소 선택
    const booksContainer = document.querySelector('.books');

    // 책 데이터
    const books = [
        {title: '책 제목1', author: '저자1', price: '12,000원', img: 'book1.jpg'},
        {title: '책 제목2', author: '저자2', price: '15,000원', img: 'book2.jpg'},
        {title: '책 제목3', author: '저자3', price: '18,000원', img: 'book3.jpg'},
        // ... 더 많은 책 정보를 추가하세요
        ];

        // 책 정보를 화면에 표시하는 함수
function displayBooks() {
    let bookHTML = '';

    for (const book of books) {
        bookHTML += `
            <div class="book">
                <img src="${book.img}" alt="${book.title}">
                <h2 class="book-title">${book.title}</h2>
                <p class="book-author">${book.author}</p>
                <p class="book-price">${book.price}</p>
            </div>
        `;
    }

    booksContainer.innerHTML = bookHTML;
}

// 책 정보를 화면에 표시
displayBooks();
});
