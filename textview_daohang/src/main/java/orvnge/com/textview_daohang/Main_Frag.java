package orvnge.com.textview_daohang;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Tom on 2016/3/27.
 */
public class Main_Frag extends Fragment {

    private String content;
    public Main_Frag(String content) {
        this.content = content;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_f1,container,false);

        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText(content);

        return view;

    }
}
