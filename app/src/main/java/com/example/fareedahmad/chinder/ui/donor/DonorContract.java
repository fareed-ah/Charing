package com.example.fareedahmad.chinder.ui.donor;

import com.example.fareedahmad.chinder.model.Organization;
import java.util.List;

public interface DonorContract {

    interface View {
        void displayOrganizations(List<Organization> organizations);
    }

    interface Presenter {
        void getOrganization();
    }
}
