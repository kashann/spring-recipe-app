package com.kashannadeem.springframework.recipe.springrecipeapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@Service
public class ImageServiceImpl implements ImageService {
    //todo implement constructor with recipe repository
    @Override
    public void saveImageFile(Long recipeId, MultipartFile file) {
        log.debug("Received a file");

    }
}
