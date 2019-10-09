package com.asifahmedsohan.rated.Callback;


import com.asifahmedsohan.rated.Model.Movie;

import java.util.List;

public interface OnGetMoviesCallback {

    void onSuccess(int page, List<Movie> movies);

    void onError();
}
