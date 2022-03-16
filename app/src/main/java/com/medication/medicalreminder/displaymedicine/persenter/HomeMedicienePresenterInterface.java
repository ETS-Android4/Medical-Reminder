package com.medication.medicalreminder.displaymedicine.persenter;

import androidx.lifecycle.LiveData;

import com.medication.medicalreminder.model.Medicine;

import java.util.List;

public interface HomeMedicienePresenterInterface {
    LiveData<List<Medicine>> getAllMedicines();
    void getStoredMedicineFireBase();

}
