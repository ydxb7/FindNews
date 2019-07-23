package ai.tomorrow.findnews.ArticleDetail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import ai.tomorrow.findnews.R;
import ai.tomorrow.findnews.databinding.FragmentArticleDetailBinding;
import ai.tomorrow.findnews.databinding.FragmentSearchNewsBinding;


public class ArticleDetailFragment extends Fragment {

    private String TAG = ArticleDetailFragment.class.getSimpleName();
    private FragmentArticleDetailBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_article_detail, container, false);



        return mBinding.getRoot();
    }
}
