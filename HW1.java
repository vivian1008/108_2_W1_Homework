public class HW1{
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("The Old Man and the Sea");
        book1.setWriter("Ernest Hemingway");
        book1.setIsbn("0-684-80122-1");
        book1.setPage("127");
        book1.setDate("1952/09/01");
        
        System.out.println("Name:"+book1.getName());
        System.out.println("Writer:"+book1.getWriter());
        System.out.println("ISBN:"+book1.getIsbn());
        System.out.println("Page:"+book1.getpage());
        System.out.println("Date:"+book1.getDate());
        System.out.println();

        Book book2 = new Book();
        book2.setName("The Five People You Meet in Heaven");
        book2.setWriter("Mitch Albom");
        book2.setIsbn("0-316-72661-3");
        book2.setPage("228");
        book2.setDate("2003/09/23");

        System.out.println("Name:"+book2.getName());
        System.out.println("Writer:"+book2.getWriter());
        System.out.println("ISBN:"+book2.getIsbn());
        System.out.println("Page:"+book2.getpage());
        System.out.println("Date:"+book2.getDate());
        System.out.println();

        Book book3 = new Book();
        book3.setName("The Hunger Games");
        book3.setWriter("Suzanne Collins");
        book3.setIsbn("978-0-439-02352-8");
        book3.setPage("374");
        book3.setDate("2008/09/14");

        System.out.println("Name:"+book3.getName());
        System.out.println("Writer:"+book3.getWriter());
        System.out.println("ISBN:"+book3.getIsbn());
        System.out.println("Page:"+book3.getpage());
        System.out.println("Date:"+book3.getDate());
        System.out.println();
    }
}