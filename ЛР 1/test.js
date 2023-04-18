const calculate = require('./calc');
const assert = require('assert');

it('Додавання', () => {
    assert.equal(calculate(3, '+', 3), 6);
})
it('Віднімання', () => {
    assert.equal(calculate(3, '-', 3), 0);
})
it('Ділення', () => {
    assert.equal(calculate(3, '/', 3), 1);
})
it('Множення', () => {
    assert.equal(calculate(3, '*', 3), 9);
})
it('Остача', () => {
    assert.equal(calculate(3, '%', 3), 0);
})
it('Степінь', () => {
    assert.equal(calculate(3, '**', 3), 27);
})
it('Infinity', () => {
    assert.equal(calculate(2, '/', 0), Infinity);
})
it('NaN', () => {
    assert.equal(calculate(0, '/', 0), NaN);
})
it('Складний вираз 6 + 43 ** 2 - 3328 / 13 == 1599', () => {
    assert.equal(calculate(calculate(6, '+', calculate(43, '**', 2)), '-' ,calculate(3328, '/', 13)), 1599);
})