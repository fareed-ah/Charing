package com.example.fareedahmad.chinder.ui.donor;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import com.example.fareedahmad.chinder.databinding.ItemOrganizationBinding;
import com.example.fareedahmad.chinder.model.Organization;

public class OrganizationViewHolder extends RecyclerView.ViewHolder {

    private ItemOrganizationBinding binding;

    public OrganizationViewHolder(@NonNull ItemOrganizationBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Organization organization) {
        binding.setOrganization(organization);
    }
}
