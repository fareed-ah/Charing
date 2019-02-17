package com.example.fareedahmad.chinder.ui.donor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;

import com.example.fareedahmad.chinder.R;
import com.example.fareedahmad.chinder.model.Organization;
import com.example.fareedahmad.chinder.network.NetworkManager;

import java.util.List;

public class DonorActivity extends AppCompatActivity implements DonorContract.View {

    private DonorContract.Presenter presenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor);
        recyclerView = findViewById(R.id.organizationRecyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        presenter = new DonorPresenterImpl(new NetworkManager(), this);
        presenter.getOrganization();
    }

    @Override
    public void displayOrganizations(List<Organization> organizations) {
        recyclerView.setAdapter(new OrganizationAdapter(organizations,presenter));
    }
}
