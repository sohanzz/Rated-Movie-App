package com.asifahmedsohan.rated.Callback;


import com.asifahmedsohan.rated.Model.Genre;

import java.util.List;

public interface OnGetGenresCallback {

    void onSuccess(List<Genre> genres);

    void onError();
}
