import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstrumentsMain {

    public static void main(String[] args) {
        new InstrumentsMain();
    }

    public InstrumentsMain(){

        Instrument violin = new Instrument();
        violin.name = "violin";
        violin.hasStrings = true;

        Instrument cello = new Instrument();
        cello.name = "cello";
        cello.hasStrings = true;

        Instrument bass = new Instrument();
        bass.name = "bass";
        bass.hasStrings = true;

        Instrument viola = new Instrument();
        viola.name = "viola";
        viola.hasStrings = true;

        Instrument saxophone = new Instrument();
        saxophone.name = "saxophone";
        saxophone.hasStrings = false;

        List<Instrument> myInstruments = new ArrayList<Instrument>();
        myInstruments.add(violin);
        myInstruments.add(cello);
        myInstruments.add(bass);
        myInstruments.add(viola);
        myInstruments.add(saxophone);

        System.out.println("Welcome to the instrument identification program.");
        System.out.println("Does your instrument have strings?");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        boolean hasStrings = line.equals("yes");

        List<Instrument> possiblInstruments = new ArrayList<Instrument>();
        for(int i = 0; i < myInstruments.size(); i++){
            Instrument thisInstrument = myInstruments.get(i);
            if(thisInstrument.hasStrings == hasStrings){
                possiblInstruments.add(thisInstrument);
            }
        }

        for(int i = 0; i < possiblInstruments.size(); i++){
            System.out.println("It might be a " + possiblInstruments.get(i).name);
        }

    }


}