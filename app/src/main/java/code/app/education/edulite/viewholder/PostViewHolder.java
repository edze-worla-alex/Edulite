package code.app.education.edulite.viewholder;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import code.app.education.edulite.R;
import code.app.education.edulite.models.Post;

public class PostViewHolder extends RecyclerView.ViewHolder {

    public TextView titleView;
    public TextView authorView;
    public ImageView shareView;
    public ImageView likesView;
    public TextView numStarsView;
    public TextView bodyView;
    public ImageView videoThumb;

    public PostViewHolder(View itemView) {
        super(itemView);

        findViews();
    }

    private void findViews() {
        titleView = (TextView) itemView.findViewById(R.id.post_title);
        authorView = (TextView) itemView.findViewById(R.id.post_author);
        shareView = (ImageView) itemView.findViewById(R.id.post_share);
        likesView = (ImageView) itemView.findViewById(R.id.post_like);
        numStarsView = (TextView) itemView.findViewById(R.id.post_num_likes);
        bodyView = (TextView) itemView.findViewById(R.id.post_body);
        videoThumb = (ImageView) itemView.findViewById(R.id.video_thumb);
    }

    public void bindToPost(Post post, View.OnClickListener onClickListener) {
        titleView.setText(post.title);
        authorView.setText(post.author);
        numStarsView.setText(String.valueOf(post.likesCount));
        bodyView.setText(post.body);

        shareView.setOnClickListener(onClickListener);
        likesView.setOnClickListener(onClickListener);
    }
}