package dayun.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecycleViewHolder> {
    private ArrayList<String> mItems;
    Context mContext;

    public RecyclerViewAdapter(ArrayList itemList) {
        mItems = itemList;
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main_item, parent, false);
        mContext = parent.getContext();
        RecycleViewHolder holder = new RecycleViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, final int position) {
        //SslConnect ssl = new SslConnect();
        //ssl.postHttps(mItems.get(position),1000,1000);
        Glide.with(mContext).load(mItems.get(position)).into(holder.mIndex);

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


}


