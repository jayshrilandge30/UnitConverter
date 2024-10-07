package uc;

import java.util.HashMap;


public class Unit_converter {

    public static void main(String[] args) {

        Class_UnitMaps unit_maps = new Class_UnitMaps();
        Class_UnitTemplate template = new Class_UnitTemplate();

        HashMap<String, String> map_mass = unit_maps.create_mass_map();
        template.add_converter("Weight", map_mass, 0, 0);

        HashMap<String, String> map_length = unit_maps.create_length_map();
        template.add_converter("Length", map_length, 1, 0);

        HashMap<String, String> map_volume = unit_maps.create_volume_map();
        template.add_converter("Volume", map_volume, 2, 0);

        HashMap<String, String> map_temp = unit_maps.create_temperature_map();
        template.add_converter("Temperature", map_temp, 0, 1);

        HashMap<String, String> map_area = unit_maps.create_area_map();
        template.add_converter("Area", map_area, 1, 1);

        HashMap<String, String> map_time = unit_maps.create_time_map();
        template.add_converter("Time", map_time, 2, 1);

        template.frame_add_rect();
        template.frame_set_properties_wrapper();
    }
}