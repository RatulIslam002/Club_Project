/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    private String members;
    
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        
        
    }
    
    public String members()
    {
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return 0;
    } 
    
    public ArrayList<Membership> purge(int month, int year){
        if(month<=0 || month>12){
            System.out.println("invalid month"+month);
            return null;
        }
        else if(year<=1900 || year>2026){
            System.out.println("invalid year"+year);
        }
        else{
            Arraylist<Membership> removal= new ArrayList();
            Iterator<Membership> it = members.iterator();
            while(it.hasNext){
                Membership m= it.next();
                if (m.getMonth()==month && m.getYear()==year){
                     System.out.println("Membership found in" +month ="/"+year);
                     removals.add(m);
                     it.remove();
                }
            } 
            return removals;
        }
    }
}
