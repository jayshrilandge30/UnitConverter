package uc;

import java.util.HashMap;

public class Class_UnitMaps {

    public HashMap<String, String> create_mass_map() {
        HashMap<String, String> hash_map = new HashMap<>();
        hash_map.put("Kilogram [kg]", "1");
        hash_map.put("Hectogram [hg]", "10");
        hash_map.put("Dekagram [dag]", "100");
        hash_map.put("Gram [g]", "1000");
        hash_map.put("Ton [t]", "0.001");
        hash_map.put("Pound [lbs]", "2.2046226218");
        hash_map.put("Stone [st]", "0.1574730444");
        hash_map.put("Ounce [oz]", "35.27396195");
        return hash_map;
    }
    
    public HashMap<String, String> create_length_map() {
        HashMap<String, String> hash_map = new HashMap<>();
        hash_map.put("Meter [m]", "1");
        hash_map.put("Millimeter [mm]", "1000");
        hash_map.put("Centimeter [cm]", "100");
        hash_map.put("Decimeter [dm]", "10");
        hash_map.put("Kilometer [km]", "0.001");
        hash_map.put("Inch [in]", "39.37007874");
        hash_map.put("Foot [ft]", "3.280839895");
        hash_map.put("Yard [yd]", "1.0936132983");
        hash_map.put("Mile [ml]", "0.0006213689");
        return hash_map;
    }
    
    public HashMap<String, String> create_volume_map() {
        HashMap<String, String> hash_map = new HashMap<>();
        hash_map.put("Liter [l]", "1");
        hash_map.put("Milliliter [ml]", "1000");
        hash_map.put("Hectoliter [hl]", "0.01");
        hash_map.put("Deciliter [dl]", "10");
        hash_map.put("Centiliter [cl]", "100");
        hash_map.put("Teaspoon [tbsp]", "202.88423183");
        hash_map.put("Pint [pt]", "1.7597539864");
        hash_map.put("Gallon [gal]", "0.2199692483");
        hash_map.put("Cup [cup]", "4.2267548297");
        return hash_map;
    }
    
    public HashMap<String, String> create_temperature_map() {
        HashMap<String, String> hash_map = new HashMap<>();
        hash_map.put("Celsius [C]", "1");
        hash_map.put("Kelvin [K]", "274.15");
        hash_map.put("Fahrenheit [°F]", "33.8");
        return hash_map;
    }

    public HashMap<String, String> create_area_map() {
        HashMap<String, String> hash_map = new HashMap<>();
        hash_map.put("Square meter", "1");
        hash_map.put("Square Kilometer", "0.000001");
        hash_map.put("Square Centimeter", "10000");
        hash_map.put("Square Milimeter", "1000000");
        hash_map.put("Hectare", "0.0001");
        hash_map.put("Acre", "0.0002471054");
        hash_map.put("Square Inch", "1550.0031");
        hash_map.put("Square Foot", "10.763910417");
        hash_map.put("Square Yard", "1.1959900463");
        hash_map.put("Square Mile", "0.000003861018768");
        return hash_map;
    }

    public HashMap<String, String> create_time_map() {
        HashMap<String, String> hash_map = new HashMap<>();
        hash_map.put("Second [s]", "60");
        hash_map.put("Minute [min]", "1");
        hash_map.put("Hour [h]", "0.0166666667");
        hash_map.put("Day [d]", "0.0006944444");
        hash_map.put("Year [a]", "0.0000019013");
        hash_map.put("Week [w]", "0.0000992063");
        hash_map.put("Month [mon]", "0.0000228154");
        return hash_map;
    }
}
