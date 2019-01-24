package exercises.week10.exercise01;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PokeMonVarieties {

    //sorted with Comparator
    //limit
    //filter
    //count
    //forEach
    //findFirst
    //noneMatch
    //anyMatch

    List<PokeMon> pokeMons =new PokeMonReader().getPoke();

    public List<String> getHighStandardType(){
        return pokeMons.stream()
                .map(PokeMon::getTypeOne)
                .collect(Collectors.toList());
    }

    public List<PokeMon> getPokeMonsStartWithT(){
        return pokeMons.stream()
                .filter(pokeMon -> pokeMon.getName().toLowerCase().startsWith("t"))
                .collect(Collectors.toList());
    }

    public  List<PokeMon> getPokeMansHighTotal(){
        return   pokeMons.stream()
                .sorted(Comparator.comparing(PokeMon::getTotal).reversed())
                .collect(Collectors.toList());

    }
    public Set<PokeMon> getPokeManStartwithCEndWithD(){
        return pokeMons.stream()
                .filter(pokeMon -> pokeMon.getName().startsWith("C"))
                .filter(pokeMon -> pokeMon.getName().endsWith("d"))
                .limit(7)
                .collect(Collectors.toSet());
    }
    public Set<String> getNameOfTypeOne(){
        return pokeMons.stream()
                .map(PokeMon::getTypeOne)
                .collect(Collectors.toSet());

    }

    public Map<String,Long> getNumberOfTypeOne(){
        return pokeMons.stream()
                .map(PokeMon::getTypeOne)
                .collect(Collectors.groupingBy(e -> e,Collectors.counting()));
    }

   public Map<String,List<PokeMon>> groupByFirstPower(){
       return pokeMons.stream()
////                .map(PokeMon::getSpeed)
        .collect(Collectors.groupingBy(pokeMon -> pokeMon.getTypeOne(),Collectors.toList()));
   }

    public List<String> sortName(){
        return pokeMons.stream()
                .map(PokeMon::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<PokeMon> sortCompratorSpeed(){
        return pokeMons.stream()
                .sorted(Comparator.comparing(PokeMon::getSpeed).reversed())
                .collect(Collectors.toList());
    }




}
