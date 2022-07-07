package BookDetails;
public class Book1
{

    public String title;
    public String author;
    public int year;
    public String publisher;
    public int price;
    public Book1(String title,String author,int year,String publisher,int price)
    {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher=publisher;
        this.price=price;
    }

    public void getTitle()
    {
        System.out.println("Title of the book "+title);
    }   

    public void getAuthor()
    {
        System.out.println("Author of the book "+author);
    }   

    public void getyear()
    {
        System.out.println("year "+year);
    }   

    public void getPublisher()
    {
        System.out.println("publisher of the book "+publisher);
    } 
    
    public void getPrice()
    {
        System.out.println("price of the book "+price);
    }   

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setYear( int year)
    {
        this.year = year;
    }    

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public void print()
    {
        getTitle();
        getAuthor();
        getyear();
        getPublisher();
        getPrice();
    }
}
