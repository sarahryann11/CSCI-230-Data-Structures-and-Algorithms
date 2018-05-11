package csci230project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * TestHashing Class
 * 
 * @author Sarah Nicholson
 */
public class TestHashing 
{
    public static void main(String[] args) throws FileNotFoundException, FullHashTableException 
    {
        OpenHashing openHashingSameSize = new OpenHashing(389);
        ClosedHashing closedHashingSameSize = new ClosedHashing(389);
        
        OpenHashing openHashingSmallSize = new OpenHashing(131);
        ClosedHashing closedHashingSmallSize = new ClosedHashing(131);
        
        OpenHashing openHashingBigSize = new OpenHashing(1543);
        ClosedHashing closedHashingBigSize = new ClosedHashing(1543);
        
        OpenHashing openHashing4 = new OpenHashing(97);
        ClosedHashing closedHashing4 = new ClosedHashing(97);
        
        OpenHashing openHashing5 = new OpenHashing(3079);
        ClosedHashing closedHashing5 = new ClosedHashing(3079);
        
        OpenHashing openHashing6 = new OpenHashing(769);
        ClosedHashing closedHashing6 = new ClosedHashing(769);
        
        OpenHashing openHashing7 = new OpenHashing(53);
        ClosedHashing closedHashing7 = new ClosedHashing(53);
        
        OpenHashing openHashing8 = new OpenHashing(193);
        ClosedHashing closedHashing8 = new ClosedHashing(193);
        
        OpenHashing openHashing9 = new OpenHashing(6151);
        ClosedHashing closedHashing9 = new ClosedHashing(6151);
        
        long startTime = 0;
        long stopTime = 0;
        long time = 0;
        
        long openHashingSuccessfulTime = 0;
        long openHashingSuccessfulTime2 = 0;
        long openHashingSuccessfulTime3 = 0;
        long openHashingSuccessfulTime4 = 0;
        long openHashingSuccessfulTime5 = 0;
        long openHashingSuccessfulTime6 = 0;
        long openHashingSuccessfulTime7 = 0;
        long openHashingSuccessfulTime8 = 0;
        long openHashingSuccessfulTime9 = 0;
        
        
        long closedHashingSuccessfulTime = 0;
        long closedHashingSuccessfulTime2 = 0;
        long closedHashingSuccessfulTime3 = 0;
        long closedHashingSuccessfulTime4 = 0;
        long closedHashingSuccessfulTime5 = 0;
        long closedHashingSuccessfulTime6 = 0;
        long closedHashingSuccessfulTime7 = 0;
        long closedHashingSuccessfulTime8 = 0;
        long closedHashingSuccessfulTime9 = 0;
        
        
        
        long openHashingUnsuccessfulTime = 0;
        long openHashingUnsuccessfulTime2 = 0;
        long openHashingUnsuccessfulTime3 = 0;
        long openHashingUnsuccessfulTime4 = 0;
        long openHashingUnsuccessfulTime5 = 0;
        long openHashingUnsuccessfulTime6 = 0;
        long openHashingUnsuccessfulTime7 = 0;
        long openHashingUnsuccessfulTime8 = 0;
        long openHashingUnsuccessfulTime9 = 0;
        
        
        long closedHashingUnsuccessfulTime = 0;
        long closedHashingUnsuccessfulTime2 = 0;
        long closedHashingUnsuccessfulTime3 = 0;
        long closedHashingUnsuccessfulTime4 = 0;
        long closedHashingUnsuccessfulTime5 = 0;
        long closedHashingUnsuccessfulTime6 = 0;
        long closedHashingUnsuccessfulTime7 = 0;
        long closedHashingUnsuccessfulTime8 = 0;
        long closedHashingUnsuccessfulTime9 = 0;
        
        
        //Strings11 text file goes here in path
        String path = "C:\\Users\\LinkX\\OneDrive\\Documents\\Spring 2017\\Data Structures and Algorithms\\CSCI230Project\\src\\csci230project\\Strings11.txt";
        File file = new File(path);
        Scanner scan = new Scanner(file);
        
        String word;
        List<String> words = new ArrayList<String>();
        while (scan.hasNext())
        {
            word = scan.nextLine();
            words.add(word);
            openHashingSameSize.insert(word);
            closedHashingSameSize.insert(word);
            openHashingSmallSize.insert(word);
            closedHashingSmallSize.insert(word);
            openHashingBigSize.insert(word);
            closedHashingBigSize.insert(word);
            openHashing4.insert(word);
            closedHashing4.insert(word);
            openHashing5.insert(word);
            closedHashing5.insert(word);
            openHashing6.insert(word);
            closedHashing6.insert(word);
            openHashing7.insert(word);
            closedHashing7.insert(word);
            openHashing8.insert(word);
            closedHashing8.insert(word);
            openHashing9.insert(word);
            closedHashing9.insert(word);
        }
        
        //Strings15 text file goes here in path2
        String path2 = "C:\\Users\\LinkX\\OneDrive\\Documents\\Spring 2017\\Data Structures and Algorithms\\CSCI230Project\\src\\csci230project\\Strings15.txt";
        File file2 = new File(path2);
        Scanner scan2 = new Scanner(file2);
        
        String word2;
        List<String> words2 = new ArrayList<>();
        while (scan2.hasNext())
        {
            word2 = scan2.nextLine();
            words2.add(word2);
        }
        
        //SUCCESSFUL SEARCHES FOR OPEN HASHING
        
        ArrayList openSuccTimes = new ArrayList();
        ArrayList openSuccTimes2 = new ArrayList();
        ArrayList openSuccTimes3 = new ArrayList();
        ArrayList openSuccTimes4 = new ArrayList();
        ArrayList openSuccTimes5 = new ArrayList();
        ArrayList openSuccTimes6 = new ArrayList();
        ArrayList openSuccTimes7 = new ArrayList();
        ArrayList openSuccTimes8 = new ArrayList();
        ArrayList openSuccTimes9 = new ArrayList();        
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            openHashingSameSize.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openSuccTimes.add(time);
        }

        for (int i = 0; i < openSuccTimes.size(); i++)
            openHashingSuccessfulTime = openHashingSuccessfulTime + (long) openSuccTimes.get(i);
        long avgOpenSuccTime = openHashingSuccessfulTime / openSuccTimes.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            openHashingSmallSize.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openSuccTimes2.add(time);
        }
        
        for (int i = 0; i < openSuccTimes2.size(); i++)
            openHashingSuccessfulTime2 = openHashingSuccessfulTime2 + (long) openSuccTimes2.get(i);
        long avgOpenSuccTime2 = openHashingSuccessfulTime2 / openSuccTimes2.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            openHashingBigSize.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openSuccTimes3.add(time);
        }
        
        for (int i = 0; i < openSuccTimes3.size(); i++)
            openHashingSuccessfulTime3 = openHashingSuccessfulTime3 + (long) openSuccTimes3.get(i);
        long avgOpenSuccTime3 = openHashingSuccessfulTime3 / openSuccTimes3.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            openHashing4.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openSuccTimes4.add(time);
        }
        
        for (int i = 0; i < openSuccTimes4.size(); i++)
            openHashingSuccessfulTime4 = openHashingSuccessfulTime4 + (long) openSuccTimes4.get(i);
        long avgOpenSuccTime4 = openHashingSuccessfulTime4 / openSuccTimes4.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            openHashing5.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openSuccTimes5.add(time);
        }
        
        for (int i = 0; i < openSuccTimes5.size(); i++)
            openHashingSuccessfulTime5 = openHashingSuccessfulTime5 + (long) openSuccTimes5.get(i);
        long avgOpenSuccTime5 = openHashingSuccessfulTime5 / openSuccTimes5.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            openHashing6.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openSuccTimes6.add(time);
        }
        
        for (int i = 0; i < openSuccTimes6.size(); i++)
            openHashingSuccessfulTime6 = openHashingSuccessfulTime6 + (long) openSuccTimes6.get(i);
        long avgOpenSuccTime6 = openHashingSuccessfulTime6 / openSuccTimes6.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            openHashing7.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openSuccTimes7.add(time);
        }
        
        for (int i = 0; i < openSuccTimes7.size(); i++)
            openHashingSuccessfulTime7 = openHashingSuccessfulTime7 + (long) openSuccTimes7.get(i);
        long avgOpenSuccTime7 = openHashingSuccessfulTime7 / openSuccTimes7.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            openHashing8.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openSuccTimes8.add(time);
        }
        
        for (int i = 0; i < openSuccTimes8.size(); i++)
            openHashingSuccessfulTime8 = openHashingSuccessfulTime8 + (long) openSuccTimes8.get(i);
        long avgOpenSuccTime8 = openHashingSuccessfulTime8 / openSuccTimes8.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            openHashing9.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openSuccTimes9.add(time);
        }
        
        for (int i = 0; i < openSuccTimes9.size(); i++)
            openHashingSuccessfulTime9 = openHashingSuccessfulTime9 + (long) openSuccTimes9.get(i);
        long avgOpenSuccTime9 = openHashingSuccessfulTime9 / openSuccTimes9.size();
        
        //SUCCESSFUL SEARCHES FOR CLOSED HASHING
        
         ArrayList closedSuccTimes = new ArrayList();
         ArrayList closedSuccTimes2 = new ArrayList();
         ArrayList closedSuccTimes3= new ArrayList();
         ArrayList closedSuccTimes4 = new ArrayList();
         ArrayList closedSuccTimes5 = new ArrayList();
         ArrayList closedSuccTimes6 = new ArrayList();
         ArrayList closedSuccTimes7 = new ArrayList();
         ArrayList closedSuccTimes8 = new ArrayList();
         ArrayList closedSuccTimes9 = new ArrayList();         
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashingSameSize.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedSuccTimes.add(time);
        }

        for (int i = 0; i < closedSuccTimes.size(); i++)
            closedHashingSuccessfulTime = closedHashingSuccessfulTime + (long) closedSuccTimes.get(i);
        long avgClosedSuccTime = closedHashingSuccessfulTime / closedSuccTimes.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashingSmallSize.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedSuccTimes2.add(time);
        }

        for (int i = 0; i < closedSuccTimes2.size(); i++)
            closedHashingSuccessfulTime2 = closedHashingSuccessfulTime2 + (long) closedSuccTimes2.get(i);
        long avgClosedSuccTime2 = closedHashingSuccessfulTime2 / closedSuccTimes2.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashingBigSize.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedSuccTimes3.add(time);
        }

        for (int i = 0; i < closedSuccTimes3.size(); i++)
            closedHashingSuccessfulTime3 = closedHashingSuccessfulTime3 + (long) closedSuccTimes3.get(i);
        long avgClosedSuccTime3 = closedHashingSuccessfulTime3 / closedSuccTimes3.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashing4.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedSuccTimes4.add(time);
        }

        for (int i = 0; i < closedSuccTimes4.size(); i++)
            closedHashingSuccessfulTime4 = closedHashingSuccessfulTime4 + (long) closedSuccTimes4.get(i);
        long avgClosedSuccTime4 = closedHashingSuccessfulTime4 / closedSuccTimes4.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashing5.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedSuccTimes5.add(time);
        }

        for (int i = 0; i < closedSuccTimes5.size(); i++)
            closedHashingSuccessfulTime5 = closedHashingSuccessfulTime5 + (long) closedSuccTimes5.get(i);
        long avgClosedSuccTime5 = closedHashingSuccessfulTime5 / closedSuccTimes5.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashing6.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedSuccTimes6.add(time);
        }

        for (int i = 0; i < closedSuccTimes6.size(); i++)
            closedHashingSuccessfulTime6 = closedHashingSuccessfulTime6 + (long) closedSuccTimes6.get(i);
        long avgClosedSuccTime6 = closedHashingSuccessfulTime6 / closedSuccTimes6.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashing7.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedSuccTimes7.add(time);
        }

        for (int i = 0; i < closedSuccTimes7.size(); i++)
            closedHashingSuccessfulTime7 = closedHashingSuccessfulTime7 + (long) closedSuccTimes7.get(i);
        long avgClosedSuccTime7 = closedHashingSuccessfulTime7 / closedSuccTimes7.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashing8.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedSuccTimes8.add(time);
        }

        for (int i = 0; i < closedSuccTimes8.size(); i++)
            closedHashingSuccessfulTime8 = closedHashingSuccessfulTime8 + (long) closedSuccTimes8.get(i);
        long avgClosedSuccTime8 = closedHashingSuccessfulTime8 / closedSuccTimes8.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashing9.search(words.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedSuccTimes9.add(time);
        }

        for (int i = 0; i < closedSuccTimes9.size(); i++)
            closedHashingSuccessfulTime9 = closedHashingSuccessfulTime9 + (long) closedSuccTimes9.get(i);
        long avgClosedSuccTime9 = closedHashingSuccessfulTime9 / closedSuccTimes9.size();
        
        //UNSUCCESSFUL SEARCHES FOR OPEN HASHING
        ArrayList openUnsuccTimes = new ArrayList();
        ArrayList openUnsuccTimes2 = new ArrayList();
        ArrayList openUnsuccTimes3 = new ArrayList();
        ArrayList openUnsuccTimes4 = new ArrayList();
        ArrayList openUnsuccTimes5 = new ArrayList();
        ArrayList openUnsuccTimes6 = new ArrayList();
        ArrayList openUnsuccTimes7 = new ArrayList();
        ArrayList openUnsuccTimes8 = new ArrayList();
        ArrayList openUnsuccTimes9 = new ArrayList();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            openHashingSameSize.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openUnsuccTimes.add(time);
        }

        for (int i = 0; i < openUnsuccTimes.size(); i++)
            openHashingUnsuccessfulTime = openHashingUnsuccessfulTime + (long) openUnsuccTimes.get(i);
        long avgOpenUnsuccTime = openHashingUnsuccessfulTime / openUnsuccTimes.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            openHashingSmallSize.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openUnsuccTimes2.add(time);
        }

        for (int i = 0; i < openUnsuccTimes2.size(); i++)
            openHashingUnsuccessfulTime2 = openHashingUnsuccessfulTime2 + (long) openUnsuccTimes2.get(i);
        long avgOpenUnsuccTime2 = openHashingUnsuccessfulTime2 / openUnsuccTimes2.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            openHashingBigSize.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openUnsuccTimes3.add(time);
        }

        for (int i = 0; i < openUnsuccTimes3.size(); i++)
            openHashingUnsuccessfulTime3 = openHashingUnsuccessfulTime3 + (long) openUnsuccTimes3.get(i);
        long avgOpenUnsuccTime3 = openHashingUnsuccessfulTime3 / openUnsuccTimes3.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            openHashing4.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openUnsuccTimes4.add(time);
        }

        for (int i = 0; i < openUnsuccTimes4.size(); i++)
            openHashingUnsuccessfulTime4 = openHashingUnsuccessfulTime4 + (long) openUnsuccTimes4.get(i);
        long avgOpenUnsuccTime4 = openHashingUnsuccessfulTime4 / openUnsuccTimes4.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            openHashing5.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openUnsuccTimes5.add(time);
        }

        for (int i = 0; i < openUnsuccTimes5.size(); i++)
            openHashingUnsuccessfulTime5 = openHashingUnsuccessfulTime5 + (long) openUnsuccTimes5.get(i);
        long avgOpenUnsuccTime5 = openHashingUnsuccessfulTime5 / openUnsuccTimes5.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            openHashing6.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openUnsuccTimes6.add(time);
        }

        for (int i = 0; i < openUnsuccTimes6.size(); i++)
            openHashingUnsuccessfulTime6 = openHashingUnsuccessfulTime6 + (long) openUnsuccTimes6.get(i);
        long avgOpenUnsuccTime6 = openHashingUnsuccessfulTime6 / openUnsuccTimes6.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            openHashing7.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openUnsuccTimes7.add(time);
        }

        for (int i = 0; i < openUnsuccTimes7.size(); i++)
            openHashingUnsuccessfulTime7 = openHashingUnsuccessfulTime7 + (long) openUnsuccTimes7.get(i);
        long avgOpenUnsuccTime7 = openHashingUnsuccessfulTime7 / openUnsuccTimes7.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            openHashing8.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openUnsuccTimes8.add(time);
        }

        for (int i = 0; i < openUnsuccTimes8.size(); i++)
            openHashingUnsuccessfulTime8 = openHashingUnsuccessfulTime8 + (long) openUnsuccTimes8.get(i);
        long avgOpenUnsuccTime8 = openHashingUnsuccessfulTime8 / openUnsuccTimes8.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            openHashing9.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            openUnsuccTimes9.add(time);
        }

        for (int i = 0; i < openUnsuccTimes9.size(); i++)
            openHashingUnsuccessfulTime9 = openHashingUnsuccessfulTime9 + (long) openUnsuccTimes9.get(i);
        long avgOpenUnsuccTime9 = openHashingUnsuccessfulTime9 / openUnsuccTimes9.size();
               
        
        
        
        //UNSUCCESSFUL SEARCHES FOR CLOSED HASHING
        
        ArrayList closedUnsuccTimes = new ArrayList();
        ArrayList closedUnsuccTimes2 = new ArrayList();
        ArrayList closedUnsuccTimes3 = new ArrayList();
        ArrayList closedUnsuccTimes4 = new ArrayList();
        ArrayList closedUnsuccTimes5 = new ArrayList();
        ArrayList closedUnsuccTimes6 = new ArrayList();
        ArrayList closedUnsuccTimes7 = new ArrayList();
        ArrayList closedUnsuccTimes8 = new ArrayList();
        ArrayList closedUnsuccTimes9 = new ArrayList();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashingSameSize.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedUnsuccTimes.add(time);
        }

        for (int i = 0; i < closedUnsuccTimes.size(); i++)
            closedHashingUnsuccessfulTime = closedHashingUnsuccessfulTime + (long) closedUnsuccTimes.get(i);
        long avgClosedUnsuccTime = closedHashingUnsuccessfulTime / closedUnsuccTimes.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashingSmallSize.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedUnsuccTimes2.add(time);
        }

        for (int i = 0; i < closedUnsuccTimes2.size(); i++)
            closedHashingUnsuccessfulTime2 = closedHashingUnsuccessfulTime2 + (long) closedUnsuccTimes2.get(i);
        long avgClosedUnsuccTime2 = closedHashingUnsuccessfulTime2 / closedUnsuccTimes2.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashingBigSize.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedUnsuccTimes3.add(time);
        }

        for (int i = 0; i < closedUnsuccTimes3.size(); i++)
            closedHashingUnsuccessfulTime3 = closedHashingUnsuccessfulTime3 + (long) closedUnsuccTimes3.get(i);
        long avgClosedUnsuccTime3 = closedHashingUnsuccessfulTime3 / closedUnsuccTimes3.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashing4.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedUnsuccTimes4.add(time);
        }

        for (int i = 0; i < closedUnsuccTimes4.size(); i++)
            closedHashingUnsuccessfulTime4 = closedHashingUnsuccessfulTime4 + (long) closedUnsuccTimes4.get(i);
        long avgClosedUnsuccTime4 = closedHashingUnsuccessfulTime4 / closedUnsuccTimes4.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashing5.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedUnsuccTimes5.add(time);
        }

        for (int i = 0; i < closedUnsuccTimes5.size(); i++)
            closedHashingUnsuccessfulTime5 = closedHashingUnsuccessfulTime5 + (long) closedUnsuccTimes5.get(i);
        long avgClosedUnsuccTime5 = closedHashingUnsuccessfulTime5 / closedUnsuccTimes5.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashing6.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedUnsuccTimes6.add(time);
        }

        for (int i = 0; i < closedUnsuccTimes6.size(); i++)
            closedHashingUnsuccessfulTime6 = closedHashingUnsuccessfulTime6 + (long) closedUnsuccTimes6.get(i);
        long avgClosedUnsuccTime6 = closedHashingUnsuccessfulTime6 / closedUnsuccTimes6.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashing7.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedUnsuccTimes7.add(time);
        }

        for (int i = 0; i < closedUnsuccTimes7.size(); i++)
            closedHashingUnsuccessfulTime7 = closedHashingUnsuccessfulTime7 + (long) closedUnsuccTimes7.get(i);
        long avgClosedUnsuccTime7 = closedHashingUnsuccessfulTime7 / closedUnsuccTimes7.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashing8.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedUnsuccTimes8.add(time);
        }

        for (int i = 0; i < closedUnsuccTimes8.size(); i++)
            closedHashingUnsuccessfulTime8 = closedHashingUnsuccessfulTime8 + (long) closedUnsuccTimes8.get(i);
        long avgClosedUnsuccTime8 = closedHashingUnsuccessfulTime8 / closedUnsuccTimes8.size();
        
        startTime = System.nanoTime();
        for (int i = 0; i < words2.size(); i++)
        {
            startTime = System.nanoTime();
            closedHashing9.search(words2.get(i));
            stopTime = System.nanoTime(); 
            time = stopTime - startTime;
            closedUnsuccTimes9.add(time);
        }

        for (int i = 0; i < closedUnsuccTimes9.size(); i++)
            closedHashingUnsuccessfulTime9 = closedHashingUnsuccessfulTime9 + (long) closedUnsuccTimes9.get(i);
        long avgClosedUnsuccTime9 = closedHashingUnsuccessfulTime9 / closedUnsuccTimes9.size();
        
        //TEXT FILE SAME SIZE AS HASH TABLES (TEST 1)
        
        System.out.println("----------TEST 1-----------");
        System.out.println("Size of Hash Tables: " + openHashingSameSize.hashSize);
        System.out.println("Number of Elements (Open Hashing): " + openHashingSameSize.getElements());
        System.out.println("Load Factor of Open Hashing: " + openHashingSameSize.calcLoadFactor(openHashingSameSize.getElements()));
        System.out.println("Average successful searching for Open Hashing: " + avgOpenSuccTime);
        System.out.println("Average successful searching for Closed Hashing: " + avgClosedSuccTime);
        System.out.println("Average unsuccessful searching for Open Hashing: " + avgOpenUnsuccTime);
        System.out.println("Average unsuccessful searching for Closed Hashing: " + avgClosedUnsuccTime);
        System.out.println("Number of Elements (Closed Hashing): " + closedHashingSameSize.getElements());
        System.out.println("Load Factor of Closed Hashing: " + closedHashingSameSize.getLoad());
        System.out.println();
     
        //TEXT FILES SMALLER SIZE THAN HASH TABLES (TEST 2)
        
        System.out.println("----------TEST 2-----------");
        System.out.println("Size of Hash Tables: " + openHashingSmallSize.hashSize);
        System.out.println("Number of Elements (Open Hashing): " + openHashingSmallSize.getElements());
        System.out.println("Load Factor of Open Hashing: " + openHashingSmallSize.calcLoadFactor(openHashingSmallSize.getElements()));
        System.out.println("Average successful searching for Open Hashing: " + avgOpenSuccTime2);
        System.out.println("Average successful searching for Closed Hashing: " + avgClosedSuccTime2);
        System.out.println("Average unsuccessful searching for Open Hashing: " + avgOpenUnsuccTime2);
        System.out.println("Average unsuccessful searching for Closed Hashing: " + avgClosedUnsuccTime2);
        System.out.println("Number of Elements (Closed Hashing): " + closedHashingSmallSize.getElements());
        System.out.println("Load Factor of Closed Hashing: " + closedHashingSmallSize.getLoad());
        System.out.println();
        
        //TEXT FILES BIGGER SIZE THAN HASH TABLES (TEST 3)
        
        System.out.println("----------TEST 3-----------");
        System.out.println("Size of Hash Tables: " + openHashingBigSize.hashSize);
        System.out.println("Number of Elements (Open Hashing): " + openHashingBigSize.getElements());
        System.out.println("Average successful searching for Open Hashing: " + avgOpenSuccTime3);
        System.out.println("Average successful searching for Closed Hashing: " + avgClosedSuccTime3);
        System.out.println("Average unsuccessful searching for Open Hashing: " + avgOpenUnsuccTime3);
        System.out.println("Average unsuccessful searching for Closed Hashing: " + avgClosedUnsuccTime3);
        System.out.println("Load Factor of Open Hashing: " + openHashingBigSize.calcLoadFactor(openHashingBigSize.getElements()));
        System.out.println("Number of Elements (Closed Hashing): " + closedHashingBigSize.getElements());
        System.out.println("Load Factor of Closed Hashing: " + closedHashingBigSize.getLoad());
        System.out.println();
        
        //TEST 4
        
        System.out.println("----------TEST 4-----------");
        System.out.println("Size of Hash Tables: " + openHashing4.hashSize);
        System.out.println("Number of Elements (Open Hashing): " + openHashing4.getElements());
        System.out.println("Load Factor of Open Hashing: " + openHashing4.calcLoadFactor(openHashing4.getElements()));
        System.out.println("Average successful searching for Open Hashing: " + avgOpenSuccTime4);
        System.out.println("Average successful searching for Closed Hashing: " + avgClosedSuccTime4);
        System.out.println("Average unsuccessful searching for Open Hashing: " + avgOpenUnsuccTime4);
        System.out.println("Average unsuccessful searching for Closed Hashing: " + avgClosedUnsuccTime4);
        System.out.println("Number of Elements (Closed Hashing): " + closedHashing4.getElements());
        System.out.println("Load Factor of Closed Hashing: " + closedHashing4.getLoad());
        System.out.println();
     
        //TEST 5
        
        System.out.println("----------TEST 5-----------");
        System.out.println("Size of Hash Tables: " + openHashing5.hashSize);
        System.out.println("Number of Elements (Open Hashing): " + openHashing5.getElements());
        System.out.println("Load Factor of Open Hashing: " + openHashing5.calcLoadFactor(openHashing5.getElements()));
        System.out.println("Average successful searching for Open Hashing: " + avgOpenSuccTime5);
        System.out.println("Average successful searching for Closed Hashing: " + avgClosedSuccTime5);
        System.out.println("Average unsuccessful searching for Open Hashing: " + avgOpenUnsuccTime5);
        System.out.println("Average unsuccessful searching for Closed Hashing: " + avgClosedUnsuccTime5);
        System.out.println("Number of Elements (Closed Hashing): " + closedHashing5.getElements());
        System.out.println("Load Factor of Closed Hashing: " + closedHashing5.getLoad());
        System.out.println();
        
        //TEST 6
        
        System.out.println("----------TEST 6-----------");
        System.out.println("Size of Hash Tables: " + openHashing6.hashSize);
        System.out.println("Number of Elements (Open Hashing): " + openHashing6.getElements());
        System.out.println("Load Factor of Open Hashing: " + openHashing6.calcLoadFactor(openHashing6.getElements()));
        System.out.println("Average successful searching for Open Hashing: " + avgOpenSuccTime6);
        System.out.println("Average successful searching for Closed Hashing: " + avgClosedSuccTime6);
        System.out.println("Average unsuccessful searching for Open Hashing: " + avgOpenUnsuccTime6);
        System.out.println("Average unsuccessful searching for Closed Hashing: " + avgClosedUnsuccTime6);
        System.out.println("Number of Elements (Closed Hashing): " + closedHashing6.getElements());
        System.out.println("Load Factor of Closed Hashing: " + closedHashing6.getLoad());
        System.out.println();
        
        //TEST 7
        
        System.out.println("----------TEST 7-----------");
        System.out.println("Size of Hash Tables: " + openHashing7.hashSize);
        System.out.println("Number of Elements (Open Hashing): " + openHashing7.getElements());
        System.out.println("Load Factor of Open Hashing: " + openHashing7.calcLoadFactor(openHashing7.getElements()));
        System.out.println("Average successful searching for Open Hashing: " + avgOpenSuccTime7);
        System.out.println("Average successful searching for Closed Hashing: " + avgClosedSuccTime7);
        System.out.println("Average unsuccessful searching for Open Hashing: " + avgOpenUnsuccTime7);
        System.out.println("Average unsuccessful searching for Closed Hashing: " + avgClosedUnsuccTime7);
        System.out.println("Number of Elements (Closed Hashing): " + closedHashing7.getElements());
        System.out.println("Load Factor of Closed Hashing: " + closedHashing7.getLoad());
        System.out.println();
     
        //TEST 8
        
        System.out.println("----------TEST 8-----------");
        System.out.println("Size of Hash Tables: " + openHashing8.hashSize);
        System.out.println("Number of Elements (Open Hashing): " + openHashing8.getElements());
        System.out.println("Load Factor of Open Hashing: " + openHashing8.calcLoadFactor(openHashing8.getElements()));
        System.out.println("Average successful searching for Open Hashing: " + avgOpenSuccTime8);
        System.out.println("Average successful searching for Closed Hashing: " + avgClosedSuccTime8);
        System.out.println("Average unsuccessful searching for Open Hashing: " + avgOpenUnsuccTime8);
        System.out.println("Average unsuccessful searching for Closed Hashing: " + avgClosedUnsuccTime8);
        System.out.println("Number of Elements (Closed Hashing): " + closedHashing8.getElements());
        System.out.println("Load Factor of Closed Hashing: " + closedHashing8.getLoad());
        System.out.println();
        
        //TEST 9
        
        System.out.println("----------TEST 9-----------");
        System.out.println("Size of Hash Tables: " + openHashing9.hashSize);
        System.out.println("Number of Elements (Open Hashing): " + openHashing9.getElements());
        System.out.println("Load Factor of Open Hashing: " + openHashing9.calcLoadFactor(openHashing9.getElements()));
        System.out.println("Average successful searching for Open Hashing: " + avgOpenSuccTime9);
        System.out.println("Average successful searching for Closed Hashing: " + avgClosedSuccTime9);
        System.out.println("Average unsuccessful searching for Open Hashing: " + avgOpenUnsuccTime9);
        System.out.println("Average unsuccessful searching for Closed Hashing: " + avgClosedUnsuccTime9);
        System.out.println("Number of Elements (Closed Hashing): " + closedHashing9.getElements());
        System.out.println("Load Factor of Closed Hashing: " + closedHashing9.getLoad());
        System.out.println();
    }
}