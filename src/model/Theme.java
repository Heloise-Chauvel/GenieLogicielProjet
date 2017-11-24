package model;

import java.util.ArrayList;
import java.util.List;

public class Theme {
    private String nom;

    private List<Theme> sousThemes = new ArrayList<Theme> ();

    public List<Theme> getSousThemes() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.sousThemes;
    }

    public void setSousThemes(final List<Theme> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.sousThemes = value;
    }

}
