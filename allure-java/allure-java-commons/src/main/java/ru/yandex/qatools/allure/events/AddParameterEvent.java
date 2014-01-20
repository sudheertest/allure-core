package ru.yandex.qatools.allure.events;

import ru.yandex.qatools.allure.model.Parameter;
import ru.yandex.qatools.allure.model.TestCaseResult;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 20.01.14
 */
public class AddParameterEvent extends AbstractTestCaseAddParameterEvent {
    @Override
    public void process(TestCaseResult context) {
        context.getParameters().add(new Parameter().withName(getName()).withValue(getValue()));
    }
}
