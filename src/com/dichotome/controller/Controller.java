package com.dichotome.controller;

import com.dichotome.CommandLineReader;
import com.dichotome.Data;
import com.dichotome.exceptions.CharNotLetterException;
import com.dichotome.model.SubscriberManager;
import com.dichotome.view.CommandLine;

import static com.dichotome.view.CommandLine.*;

public class Controller {
    private SubscriberManager manager;
    private CommandLine cl;
    private CommandLineReader reader;

    public Controller() {
        manager = new SubscriberManager(new Data().getSubscribers());
        cl = new CommandLine();
        reader = new CommandLineReader();
    }

    public void init() {
        int action;

        input : while (true) {
            cl.displayMenu();
            try {
                action = reader.readInteger();
            } catch (NumberFormatException e) {
                cl.printLine(INVALID_INPUT + "\n");
                continue;
            } catch (Exception e) {
                cl.printLine(UNEXPECTED_ERROR + "\n");
                continue;
            }

            switch (action) {
                case 1: {
                    cl.listSubsribers(manager.getAll());
                    break;
                }
                case 2: {
                    char startLetter;
                    cl.printLine("Enter the first letter of the names of contacts to display: \n");

                    try {
                        startLetter = reader.readChar();
                    } catch (CharNotLetterException e) {
                        cl.printLine(INVALID_INPUT + ". " + e.getMessage() + "\n");
                        break;
                    } catch (Exception e) {
                        cl.printLine(UNEXPECTED_ERROR + "\n");
                        continue;
                    }

                    cl.listSubsribers(manager.getWithStartChar(startLetter));
                    break;
                }
                case 3: {
                    cl.listSubsribers(manager.getAllWithPhoneNumber());
                    break;
                }
                case 4: break input;
                default: {
                    cl.printLine(UNEXPECTED_ERROR);
                    break;
                }

            }
        }
        cl.printLine(EXIT);
    }
}
