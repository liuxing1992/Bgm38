package me.ewriter.bangumitv.ui.bangumidetail.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import me.drakeet.multitype.ItemViewProvider;
import me.ewriter.bangumitv.R;
import me.ewriter.bangumitv.api.entity.AnimeCharacterEntity;
import me.ewriter.bangumitv.widget.GridSpacingItemDecoration;

/**
 * Created by Zubin on 2016/9/27.
 */

public class DetailCharacterItemViewProvider extends ItemViewProvider<DetailCharacterList, DetailCharacterItemViewProvider.ViewHolder> {


    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.item_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull DetailCharacterList characterList) {
        holder.setList(characterList.mList);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private RecyclerView recyclerView;
        private DetailCharacterAdapter adapter;

        public ViewHolder(View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recyclerview);
            GridLayoutManager layoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
            adapter = new DetailCharacterAdapter();
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, 20, false));
            recyclerView.setAdapter(adapter);
        }

        private void setList(List<AnimeCharacterEntity> list) {
            adapter.setList(list);
            adapter.notifyDataSetChanged();
        }
    }
}
