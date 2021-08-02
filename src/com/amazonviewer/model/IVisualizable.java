package com.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {

    /**
     * Este método captura el tiempo de inicio de visualización.
     * @param dateI
     * @return
     */
    Date startToSee(Date dateI);

    void stopToSee(Date dateI, Date dateF);

}
