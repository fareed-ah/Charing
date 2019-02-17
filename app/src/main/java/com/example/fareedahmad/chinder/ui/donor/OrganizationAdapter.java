package com.example.fareedahmad.chinder.ui.donor;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.fareedahmad.chinder.databinding.ItemOrganizationBinding;
import com.example.fareedahmad.chinder.model.Organization;

import java.util.List;

public class OrganizationAdapter extends RecyclerView.Adapter<OrganizationViewHolder> {

    private List<Organization> organizationList;
    private DonorContract.Presenter presenter;

    public OrganizationAdapter(List<Organization> organizationList, DonorContract.Presenter presenter) {
        this.organizationList = organizationList;
        this.presenter = presenter;
    }

    @NonNull
    @Override
    public OrganizationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        ItemOrganizationBinding binding = ItemOrganizationBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new OrganizationViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull OrganizationViewHolder holder, int i) {
        holder.onBind(organizationList.get(i));
    }

    @Override
    public int getItemCount() {
        return organizationList.size();
    }
}
