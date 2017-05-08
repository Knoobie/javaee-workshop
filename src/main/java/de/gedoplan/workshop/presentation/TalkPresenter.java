package de.gedoplan.workshop.presentation;

import de.gedoplan.workshop.domain.Talk;
import de.gedoplan.workshop.persistence.TalkRepository;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named // ("talkPresenter")
@RequestScoped
public class TalkPresenter {

  @Inject
  TalkRepository talkRepository;

  @PostConstruct
  void postConstruct() {
    this.talks = this.talkRepository.findAll();
  }

  private List<Talk> talks;

  public List<Talk> getTalks() {
    return this.talks;
  }
}
