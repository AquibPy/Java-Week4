public class ques3 {
    public static void main(String[] arg)
    {
        String [] lang = {"Ruby","Java","Python","Go","Swift"};
        System.out.println("String:");
        for (int i = 0; i<5;i++)
        {
            System.out.println(lang[i]);
        }
        for (int i = 0;i < 4;++i)
        {
            for (int j = i+1;j<5;++j)
            {
                if(lang[i].compareTo(lang[j])>0)
                {
                    String temp = lang[i];
                    lang[i] = lang[j];
                    lang[j] = temp;
                }
            }
        }
        System.out.println("Lexicographical Order:");
        for (int i = 0;i<5;i++)
        {
            System.out.println(lang[i]);
        }
    }
}
