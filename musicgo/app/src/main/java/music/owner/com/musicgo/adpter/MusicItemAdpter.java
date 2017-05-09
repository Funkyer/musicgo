package music.owner.com.musicgo.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import music.owner.com.musicgo.R;
import music.owner.com.musicgo.model.MusicModel;

/**
 * Created by yuxinfeng on 17/3/25.
 */

public class MusicItemAdpter extends BaseAdapter {
    private List<MusicModel> musiclist = new ArrayList<>();
    private Context mContext;

    public MusicItemAdpter(List musiclis, Context context) {
        musiclist.clear();
        musiclist.addAll(musiclist);
        mContext = context;
    }

    class ViewHolder {
        TextView mTitleView;
    }

    @Override
    public int getCount() {
        return musiclist.size();
    }

    @Override
    public Object getItem(int position) {
        return musiclist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null)
        {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.music_item, null);
            holder.mTitleView = (TextView)convertView.findViewById(R.id.tv_title_music);
            convertView.setTag(holder);
        }else
        {
            holder = (ViewHolder)convertView.getTag();
        }
        return convertView;
    }
}
