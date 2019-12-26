import {reverseLinkedList} from "../src/E01";

describe("Reverse linked list", () => {
    test("it should return null if the list is null", () => {
        expect(reverseLinkedList(null)).toEqual(null)
    })
});

